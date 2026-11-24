.class public abstract La/ap10;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:La/uuz;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, La/uuz;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V
    :try_end_0
    .catch Ljava/lang/NoSuchMethodError; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 4
    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catch_0
    :try_start_1
    new-instance v0, La/uuz;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    :goto_0
    sput-object v0, La/ap10;->a:La/uuz;
    :try_end_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 13
    .line 14
    goto :goto_3

    .line 15
    :catch_1
    move-exception v0

    .line 16
    goto :goto_1

    .line 17
    :catch_2
    move-exception v0

    .line 18
    goto :goto_2

    .line 19
    :goto_1
    const-string v1, "MDC binding unsuccessful."

    .line 20
    .line 21
    invoke-static {v1, v0}, La/lvm0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    goto :goto_3

    .line 25
    :goto_2
    new-instance v1, La/uuz;

    .line 26
    .line 27
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 28
    .line 29
    .line 30
    sput-object v1, La/ap10;->a:La/uuz;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    const-string v2, "StaticMDCBinder"

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    const-string v0, "Failed to load class \"org.slf4j.impl.StaticMDCBinder\"."

    .line 47
    .line 48
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v0, "Defaulting to no-operation MDCAdapter implementation."

    .line 52
    .line 53
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    const-string v0, "See http://www.slf4j.org/codes.html#no_static_mdc_binder for further details."

    .line 57
    .line 58
    invoke-static {v0}, La/lvm0;->m(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    :goto_3
    return-void

    .line 62
    :cond_0
    throw v0
.end method
