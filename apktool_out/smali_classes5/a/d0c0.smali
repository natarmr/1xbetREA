.class public final enum La/d0c0;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final synthetic b:[La/d0c0;

.field public static final synthetic c:La/c0o;


# instance fields
.field public final a:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, La/d0c0;

    .line 2
    .line 3
    sget-object v1, La/w2c0;->f:La/w2c0;

    .line 4
    .line 5
    sget-object v2, La/w2c0;->e:La/w2c0;

    .line 6
    .line 7
    sget-object v3, La/w2c0;->g:La/w2c0;

    .line 8
    .line 9
    sget-object v4, La/w2c0;->h:La/w2c0;

    .line 10
    .line 11
    sget-object v5, La/w2c0;->i:La/w2c0;

    .line 12
    .line 13
    filled-new-array {v1, v2, v3, v4, v5}, [La/w2c0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, "BASIC"

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {v0, v2, v1, v3}, La/d0c0;-><init>(Ljava/lang/String;Ljava/util/List;I)V

    .line 25
    .line 26
    .line 27
    new-instance v1, La/d0c0;

    .line 28
    .line 29
    sget-object v2, La/w2c0;->j:La/w2c0;

    .line 30
    .line 31
    sget-object v3, La/w2c0;->k:La/w2c0;

    .line 32
    .line 33
    sget-object v4, La/w2c0;->l:La/w2c0;

    .line 34
    .line 35
    sget-object v5, La/w2c0;->m:La/w2c0;

    .line 36
    .line 37
    filled-new-array {v2, v3, v4, v5}, [La/w2c0;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-static {v2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    const-string v3, "LOCATION"

    .line 46
    .line 47
    const/4 v4, 0x1

    .line 48
    invoke-direct {v1, v3, v2, v4}, La/d0c0;-><init>(Ljava/lang/String;Ljava/util/List;I)V

    .line 49
    .line 50
    .line 51
    new-instance v2, La/d0c0;

    .line 52
    .line 53
    sget-object v3, La/w2c0;->n:La/w2c0;

    .line 54
    .line 55
    sget-object v4, La/w2c0;->o:La/w2c0;

    .line 56
    .line 57
    sget-object v5, La/w2c0;->p:La/w2c0;

    .line 58
    .line 59
    sget-object v6, La/w2c0;->q:La/w2c0;

    .line 60
    .line 61
    sget-object v7, La/w2c0;->r:La/w2c0;

    .line 62
    .line 63
    sget-object v8, La/w2c0;->s:La/w2c0;

    .line 64
    .line 65
    sget-object v9, La/w2c0;->t:La/w2c0;

    .line 66
    .line 67
    sget-object v10, La/w2c0;->u:La/w2c0;

    .line 68
    .line 69
    filled-new-array/range {v3 .. v10}, [La/w2c0;

    .line 70
    .line 71
    .line 72
    move-result-object v3

    .line 73
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    const-string v4, "DOCUMENT"

    .line 78
    .line 79
    const/4 v5, 0x2

    .line 80
    invoke-direct {v2, v4, v3, v5}, La/d0c0;-><init>(Ljava/lang/String;Ljava/util/List;I)V

    .line 81
    .line 82
    .line 83
    filled-new-array {v0, v1, v2}, [La/d0c0;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, La/d0c0;->b:[La/d0c0;

    .line 88
    .line 89
    new-instance v1, La/c0o;

    .line 90
    .line 91
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 92
    .line 93
    .line 94
    sput-object v1, La/d0c0;->c:La/c0o;

    .line 95
    .line 96
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/d0c0;->a:Ljava/util/List;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/d0c0;
    .locals 1

    .line 1
    const-class v0, La/d0c0;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/d0c0;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/d0c0;
    .locals 1

    .line 1
    sget-object v0, La/d0c0;->b:[La/d0c0;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/d0c0;

    .line 8
    .line 9
    return-object v0
.end method
