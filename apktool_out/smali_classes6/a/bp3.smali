.class public final enum La/bp3;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum a:La/bp3;

.field public static final enum b:La/bp3;

.field public static final enum c:La/bp3;

.field public static final synthetic d:[La/bp3;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/bp3;

    .line 2
    .line 3
    const-string v1, "LIGHT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/bp3;->a:La/bp3;

    .line 10
    .line 11
    new-instance v1, La/bp3;

    .line 12
    .line 13
    const-string v2, "DARK"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v1, La/bp3;->b:La/bp3;

    .line 20
    .line 21
    new-instance v2, La/bp3;

    .line 22
    .line 23
    const-string v3, "THEME"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    sput-object v2, La/bp3;->c:La/bp3;

    .line 30
    .line 31
    filled-new-array {v0, v1, v2}, [La/bp3;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, La/bp3;->d:[La/bp3;

    .line 36
    .line 37
    new-instance v0, La/c0o;

    .line 38
    .line 39
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/bp3;
    .locals 1

    .line 1
    const-class v0, La/bp3;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/bp3;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/bp3;
    .locals 1

    .line 1
    sget-object v0, La/bp3;->d:[La/bp3;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/bp3;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Z
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
    if-eq p0, v0, :cond_0

    .line 9
    .line 10
    invoke-static {p1}, La/qem0;->r(Landroid/content/Context;)Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0

    .line 19
    :cond_1
    :goto_0
    return v0
.end method
