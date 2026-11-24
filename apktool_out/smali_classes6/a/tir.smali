.class public final enum La/tir;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation runtime La/ahi0;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "La/tir;",
        ">;"
    }
.end annotation


# static fields
.field public static final Companion:La/sir;

.field public static final a:La/a8z;

.field public static final enum b:La/tir;

.field public static final synthetic c:[La/tir;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/tir;

    .line 2
    .line 3
    const-string v1, "Started"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/tir;->b:La/tir;

    .line 10
    .line 11
    new-instance v1, La/tir;

    .line 12
    .line 13
    const-string v2, "Finished"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    filled-new-array {v0, v1}, [La/tir;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, La/tir;->c:[La/tir;

    .line 24
    .line 25
    new-instance v0, La/c0o;

    .line 26
    .line 27
    new-instance v0, La/sir;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    sput-object v0, La/tir;->Companion:La/sir;

    .line 33
    .line 34
    sget-object v0, La/wez;->a:La/wez;

    .line 35
    .line 36
    new-instance v1, La/s9r;

    .line 37
    .line 38
    const/16 v2, 0xf

    .line 39
    .line 40
    invoke-direct {v1, v2}, La/s9r;-><init>(B)V

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    sput-object v0, La/tir;->a:La/a8z;

    .line 48
    .line 49
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/tir;
    .locals 1

    .line 1
    const-class v0, La/tir;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/tir;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/tir;
    .locals 1

    .line 1
    sget-object v0, La/tir;->c:[La/tir;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/tir;

    .line 8
    .line 9
    return-object v0
.end method
