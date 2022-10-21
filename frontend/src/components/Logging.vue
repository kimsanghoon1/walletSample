<template>

<v-data-table
    :headers="headers"
    :items="logging"
    :items-per-page="5"
    class="elevation-1"
  ></v-data-table>

</template>

<script>
  const axios = require('axios').default;

  export default {
    name: 'Logging',
    props: {
      value: Object,
      editMode: Boolean,
      isNew: Boolean
    },
    data: () => ({
        headers: [
            { text: "id", value: "id" },
            { text: "timestamp", value: "timestamp" },
            { text: "eventName", value: "eventName" },
            { text: "serviceName", value: "serviceName" },
        ],
        logging : [],
    }),
    async created() {
      var temp = await axios.get(axios.backend + '/loggings')

      this.logging = temp.data._embedded.loggings;

    },
    methods: {
    }
  }
</script>

