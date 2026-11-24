.class public final enum La/ate;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements La/sgf0;


# static fields
.field public static final enum b:La/ate;

.field public static final synthetic c:[La/ate;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, La/ate;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "offset"

    .line 5
    .line 6
    const-string v3, "OFFSET"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, La/ate;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, La/ate;->b:La/ate;

    .line 12
    .line 13
    new-instance v1, La/ate;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    const-string v3, "line"

    .line 17
    .line 18
    const-string v4, "LINE"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, La/ate;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    new-instance v2, La/ate;

    .line 24
    .line 25
    const/4 v3, 0x2

    .line 26
    const-string v4, "dashed"

    .line 27
    .line 28
    const-string v5, "DASH"

    .line 29
    .line 30
    invoke-direct {v2, v5, v3, v4}, La/ate;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 31
    .line 32
    .line 33
    filled-new-array {v0, v1, v2}, [La/ate;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, La/ate;->c:[La/ate;

    .line 38
    .line 39
    new-instance v0, La/c0o;

    .line 40
    .line 41
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/ate;->a:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/ate;
    .locals 1

    .line 1
    const-class v0, La/ate;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/ate;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/ate;
    .locals 1

    .line 1
    sget-object v0, La/ate;->c:[La/ate;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/ate;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "cardSeparatorStyle"

    .line 2
    .line 3
    return-object p0
.end method

.method public final getValue()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/ate;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
