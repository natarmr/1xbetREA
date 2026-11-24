.class public final enum La/vi9;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum c:La/vi9;

.field public static final enum d:La/vi9;

.field public static final enum e:La/vi9;

.field public static final synthetic f:[La/vi9;


# instance fields
.field public final a:Z

.field public final b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, La/vi9;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const-string v2, "ENABLED"

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    invoke-direct {v0, v1, v1, v2, v3}, La/vi9;-><init>(ZZLjava/lang/String;I)V

    .line 8
    .line 9
    .line 10
    sput-object v0, La/vi9;->c:La/vi9;

    .line 11
    .line 12
    new-instance v2, La/vi9;

    .line 13
    .line 14
    const-string v4, "READ_ONLY"

    .line 15
    .line 16
    invoke-direct {v2, v1, v3, v4, v1}, La/vi9;-><init>(ZZLjava/lang/String;I)V

    .line 17
    .line 18
    .line 19
    sput-object v2, La/vi9;->d:La/vi9;

    .line 20
    .line 21
    new-instance v4, La/vi9;

    .line 22
    .line 23
    const-string v5, "WRITE_ONLY"

    .line 24
    .line 25
    const/4 v6, 0x2

    .line 26
    invoke-direct {v4, v3, v1, v5, v6}, La/vi9;-><init>(ZZLjava/lang/String;I)V

    .line 27
    .line 28
    .line 29
    new-instance v1, La/vi9;

    .line 30
    .line 31
    const-string v5, "DISABLED"

    .line 32
    .line 33
    const/4 v6, 0x3

    .line 34
    invoke-direct {v1, v3, v3, v5, v6}, La/vi9;-><init>(ZZLjava/lang/String;I)V

    .line 35
    .line 36
    .line 37
    sput-object v1, La/vi9;->e:La/vi9;

    .line 38
    .line 39
    filled-new-array {v0, v2, v4, v1}, [La/vi9;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    sput-object v0, La/vi9;->f:[La/vi9;

    .line 44
    .line 45
    new-instance v0, La/c0o;

    .line 46
    .line 47
    return-void
.end method

.method public constructor <init>(ZZLjava/lang/String;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p3, p4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/vi9;->a:Z

    .line 5
    .line 6
    iput-boolean p2, p0, La/vi9;->b:Z

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/vi9;
    .locals 1

    .line 1
    const-class v0, La/vi9;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/vi9;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/vi9;
    .locals 1

    .line 1
    sget-object v0, La/vi9;->f:[La/vi9;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/vi9;

    .line 8
    .line 9
    return-object v0
.end method
