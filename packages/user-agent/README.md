# @codebrew/capacitor-user-agent

User Agent get/set/reset plugin for Capacitor

## Install

```bash
npm install @codebrew/capacitor-user-agent
npx cap sync
```

## API

<docgen-index>

* [`set(...)`](#set)
* [`get()`](#get)
* [`reset()`](#reset)

</docgen-index>

<docgen-api>
<!--Update the source file JSDoc comments and rerun docgen to update the docs below-->

### set(...)

```typescript
set(options: { userAgent: string; }) => Promise<{ userAgent: string; }>
```

| Param         | Type                                |
| ------------- | ----------------------------------- |
| **`options`** | <code>{ userAgent: string; }</code> |

**Returns:** <code>Promise&lt;{ userAgent: string; }&gt;</code>

--------------------


### get()

```typescript
get() => Promise<{ userAgent: string; }>
```

**Returns:** <code>Promise&lt;{ userAgent: string; }&gt;</code>

--------------------


### reset()

```typescript
reset() => Promise<void>
```

--------------------

</docgen-api>
