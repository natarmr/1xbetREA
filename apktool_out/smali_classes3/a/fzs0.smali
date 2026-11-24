.class public abstract enum La/fzs0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final a:La/bzs0;

.field public static final synthetic b:[La/fzs0;

.field public static final synthetic c:La/c0o;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, La/czs0;

    .line 2
    .line 3
    invoke-direct {v0}, La/czs0;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, La/ezs0;

    .line 7
    .line 8
    invoke-direct {v1}, La/ezs0;-><init>()V

    .line 9
    .line 10
    .line 11
    new-instance v2, La/dzs0;

    .line 12
    .line 13
    invoke-direct {v2}, La/dzs0;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v3, 0x3

    .line 17
    new-array v3, v3, [La/fzs0;

    .line 18
    .line 19
    const/4 v4, 0x0

    .line 20
    aput-object v0, v3, v4

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    aput-object v1, v3, v0

    .line 24
    .line 25
    const/4 v0, 0x2

    .line 26
    aput-object v2, v3, v0

    .line 27
    .line 28
    sput-object v3, La/fzs0;->b:[La/fzs0;

    .line 29
    .line 30
    new-instance v0, La/c0o;

    .line 31
    .line 32
    invoke-direct {v0, v3}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, La/fzs0;->c:La/c0o;

    .line 36
    .line 37
    new-instance v0, La/bzs0;

    .line 38
    .line 39
    invoke-direct {v0, v4}, La/bzs0;-><init>(B)V

    .line 40
    .line 41
    .line 42
    sput-object v0, La/fzs0;->a:La/bzs0;

    .line 43
    .line 44
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/fzs0;
    .locals 1

    .line 1
    const-class v0, La/fzs0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/fzs0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/fzs0;
    .locals 1

    .line 1
    sget-object v0, La/fzs0;->b:[La/fzs0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/fzs0;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public b()I
    .locals 0

    .line 1
    const/16 p0, 0x18

    .line 2
    .line 3
    return p0
.end method
