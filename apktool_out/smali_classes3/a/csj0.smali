.class public final enum La/csj0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum b:La/csj0;

.field public static final enum c:La/csj0;

.field public static final enum d:La/csj0;

.field public static final enum e:La/csj0;

.field public static final enum f:La/csj0;

.field public static final synthetic g:[La/csj0;

.field public static final synthetic h:La/c0o;


# instance fields
.field public final a:B


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/csj0;

    .line 2
    .line 3
    const-string v1, "HISTORY_SHORTCUT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2, v2}, La/csj0;-><init>(Ljava/lang/String;II)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/csj0;->b:La/csj0;

    .line 10
    .line 11
    new-instance v1, La/csj0;

    .line 12
    .line 13
    const-string v2, "LINE_SHORTCUT"

    .line 14
    .line 15
    const/4 v3, 0x1

    .line 16
    invoke-direct {v1, v2, v3, v3}, La/csj0;-><init>(Ljava/lang/String;II)V

    .line 17
    .line 18
    .line 19
    sput-object v1, La/csj0;->c:La/csj0;

    .line 20
    .line 21
    new-instance v2, La/csj0;

    .line 22
    .line 23
    const-string v3, "LIVE_SHORTCUT"

    .line 24
    .line 25
    const/4 v4, 0x2

    .line 26
    invoke-direct {v2, v3, v4, v4}, La/csj0;-><init>(Ljava/lang/String;II)V

    .line 27
    .line 28
    .line 29
    sput-object v2, La/csj0;->d:La/csj0;

    .line 30
    .line 31
    new-instance v3, La/csj0;

    .line 32
    .line 33
    const-string v4, "ONE_X_GAMES_SHORTCUT"

    .line 34
    .line 35
    const/4 v5, 0x3

    .line 36
    invoke-direct {v3, v4, v5, v5}, La/csj0;-><init>(Ljava/lang/String;II)V

    .line 37
    .line 38
    .line 39
    sput-object v3, La/csj0;->e:La/csj0;

    .line 40
    .line 41
    new-instance v4, La/csj0;

    .line 42
    .line 43
    const-string v5, "CYBER_SPORT_SHORTCUT"

    .line 44
    .line 45
    const/4 v6, 0x4

    .line 46
    invoke-direct {v4, v5, v6, v6}, La/csj0;-><init>(Ljava/lang/String;II)V

    .line 47
    .line 48
    .line 49
    sput-object v4, La/csj0;->f:La/csj0;

    .line 50
    .line 51
    filled-new-array {v0, v1, v2, v3, v4}, [La/csj0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    sput-object v0, La/csj0;->g:[La/csj0;

    .line 56
    .line 57
    new-instance v1, La/c0o;

    .line 58
    .line 59
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 60
    .line 61
    .line 62
    sput-object v1, La/csj0;->h:La/c0o;

    .line 63
    .line 64
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p3, p0, La/csj0;->a:B

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/csj0;
    .locals 1

    .line 1
    const-class v0, La/csj0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/csj0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/csj0;
    .locals 1

    .line 1
    sget-object v0, La/csj0;->g:[La/csj0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/csj0;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    if-eqz p0, :cond_4

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p0, v0, :cond_3

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/4 v0, 0x3

    .line 14
    if-eq p0, v0, :cond_1

    .line 15
    .line 16
    const/4 v0, 0x4

    .line 17
    if-ne p0, v0, :cond_0

    .line 18
    .line 19
    const-string p0, "android.intent.action.CUBER_SPORT"

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 23
    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    return-object p0

    .line 27
    :cond_1
    const-string p0, "android.intent.action.ONE_X_GAMES"

    .line 28
    .line 29
    return-object p0

    .line 30
    :cond_2
    const-string p0, "android.intent.action.LIVE"

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_3
    const-string p0, "android.intent.action.LINE"

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_4
    const-string p0, "android.intent.action.HISTORY"

    .line 37
    .line 38
    return-object p0
.end method

.method public final b()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p0, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eq p0, v0, :cond_2

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-eq p0, v2, :cond_2

    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    if-eq p0, v2, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    if-ne p0, v0, :cond_0

    .line 19
    .line 20
    return v1

    .line 21
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_1
    return v0

    .line 27
    :cond_2
    return v1

    .line 28
    :cond_3
    return v0
.end method

.method public final d()Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    const/4 v0, 0x1

    .line 6
    if-eqz p0, :cond_3

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-eq p0, v0, :cond_2

    .line 10
    .line 11
    const/4 v2, 0x2

    .line 12
    if-eq p0, v2, :cond_2

    .line 13
    .line 14
    const/4 v2, 0x3

    .line 15
    if-eq p0, v2, :cond_1

    .line 16
    .line 17
    const/4 v0, 0x4

    .line 18
    if-ne p0, v0, :cond_0

    .line 19
    .line 20
    return v1

    .line 21
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 22
    .line 23
    .line 24
    const/4 p0, 0x0

    .line 25
    return p0

    .line 26
    :cond_1
    return v0

    .line 27
    :cond_2
    return v1

    .line 28
    :cond_3
    return v0
.end method
