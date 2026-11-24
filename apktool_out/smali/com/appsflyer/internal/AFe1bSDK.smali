.class public final Lcom/appsflyer/internal/AFe1bSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final AFKeystoreWrapper:Lkotlin/text/Regex;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lkotlin/text/Regex;

    .line 2
    .line 3
    const-string v1, "\\p{C}"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lcom/appsflyer/internal/AFe1bSDK;->AFKeystoreWrapper:Lkotlin/text/Regex;

    .line 9
    .line 10
    return-void
.end method

.method public static final synthetic AFKeystoreWrapper()Lkotlin/text/Regex;
    .locals 1

    .line 1
    sget-object v0, Lcom/appsflyer/internal/AFe1bSDK;->AFKeystoreWrapper:Lkotlin/text/Regex;

    .line 2
    .line 3
    return-object v0
.end method
