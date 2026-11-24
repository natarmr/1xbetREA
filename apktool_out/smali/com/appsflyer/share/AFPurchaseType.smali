.class public final enum Lcom/appsflyer/share/AFPurchaseType;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/appsflyer/share/AFPurchaseType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\tj\u0002\u0008\nj\u0002\u0008\u000b"
    }
    d2 = {
        "Lcom/appsflyer/share/AFPurchaseType;",
        "",
        "",
        "p0",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "value",
        "Ljava/lang/String;",
        "getValue",
        "()Ljava/lang/String;",
        "SUBSCRIPTION",
        "ONE_TIME_PURCHASE"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic AFKeystoreWrapper:La/a0o;

.field public static final enum ONE_TIME_PURCHASE:Lcom/appsflyer/share/AFPurchaseType;

.field public static final enum SUBSCRIPTION:Lcom/appsflyer/share/AFPurchaseType;

.field private static final synthetic unregisterClient:[Lcom/appsflyer/share/AFPurchaseType;


# instance fields
.field private final value:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/appsflyer/share/AFPurchaseType;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "subscription"

    .line 5
    .line 6
    const-string v3, "SUBSCRIPTION"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lcom/appsflyer/share/AFPurchaseType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lcom/appsflyer/share/AFPurchaseType;->SUBSCRIPTION:Lcom/appsflyer/share/AFPurchaseType;

    .line 12
    .line 13
    new-instance v1, Lcom/appsflyer/share/AFPurchaseType;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "one_time_purchase"

    .line 17
    .line 18
    const-string v4, "ONE_TIME_PURCHASE"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lcom/appsflyer/share/AFPurchaseType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lcom/appsflyer/share/AFPurchaseType;->ONE_TIME_PURCHASE:Lcom/appsflyer/share/AFPurchaseType;

    .line 24
    .line 25
    filled-new-array {v0, v1}, [Lcom/appsflyer/share/AFPurchaseType;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lcom/appsflyer/share/AFPurchaseType;->unregisterClient:[Lcom/appsflyer/share/AFPurchaseType;

    .line 30
    .line 31
    new-instance v1, La/c0o;

    .line 32
    .line 33
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 34
    .line 35
    .line 36
    sput-object v1, Lcom/appsflyer/share/AFPurchaseType;->AFKeystoreWrapper:La/a0o;

    .line 37
    .line 38
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lcom/appsflyer/share/AFPurchaseType;->value:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static getEntries()La/a0o;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "La/a0o;"
        }
    .end annotation

    .line 1
    sget-object v0, Lcom/appsflyer/share/AFPurchaseType;->AFKeystoreWrapper:La/a0o;

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/appsflyer/share/AFPurchaseType;
    .locals 1

    .line 1
    const-class v0, Lcom/appsflyer/share/AFPurchaseType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lcom/appsflyer/share/AFPurchaseType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lcom/appsflyer/share/AFPurchaseType;
    .locals 1

    .line 1
    sget-object v0, Lcom/appsflyer/share/AFPurchaseType;->unregisterClient:[Lcom/appsflyer/share/AFPurchaseType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lcom/appsflyer/share/AFPurchaseType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/appsflyer/share/AFPurchaseType;->value:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
