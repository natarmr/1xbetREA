.class public final enum La/fc8;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:La/fc8;

.field public static final enum b:La/fc8;

.field public static final synthetic c:[La/fc8;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, La/fc8;

    .line 2
    .line 3
    const-string v1, "WILD_FREEBET_ACTIVATION"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/fc8;->a:La/fc8;

    .line 10
    .line 11
    new-instance v1, La/fc8;

    .line 12
    .line 13
    const-string v2, "WILD_FREEBET_CHANGE_GAME"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, La/fc8;->b:La/fc8;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [La/fc8;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, La/fc8;->c:[La/fc8;

    .line 26
    .line 27
    new-instance v0, La/c0o;

    .line 28
    .line 29
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/fc8;
    .locals 1

    .line 1
    const-class v0, La/fc8;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/fc8;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/fc8;
    .locals 1

    .line 1
    sget-object v0, La/fc8;->c:[La/fc8;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/fc8;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p0, :cond_1

    .line 7
    .line 8
    if-ne p0, v0, :cond_0

    .line 9
    .line 10
    const/4 p0, 0x2

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 13
    .line 14
    .line 15
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    :cond_1
    return v0
.end method
