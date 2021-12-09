import client_1 from "./connect-client.default";
async function sayHello_1(): Promise<string | undefined> { return client_1.call("HelloService", "sayHello"); }
export { sayHello_1 as sayHello };
