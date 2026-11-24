.class public final enum La/m4s;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final d:La/ddk;

.field public static final enum e:La/m4s;

.field public static final synthetic f:[La/m4s;

.field public static final synthetic g:La/c0o;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:I

.field public final c:La/qg40;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, La/m4s;

    .line 2
    .line 3
    new-instance v5, La/qg40;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    const v6, 0x7fffffff

    .line 7
    .line 8
    .line 9
    invoke-direct {v5, v1, v6}, La/qg40;-><init>(II)V

    .line 10
    .line 11
    .line 12
    const-string v1, "ANY"

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    const-string v3, "any"

    .line 16
    .line 17
    const v4, 0x7f13010f

    .line 18
    .line 19
    .line 20
    invoke-direct/range {v0 .. v5}, La/m4s;-><init>(Ljava/lang/String;ILjava/lang/String;ILa/qg40;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, La/m4s;->e:La/m4s;

    .line 24
    .line 25
    new-instance v7, La/m4s;

    .line 26
    .line 27
    new-instance v12, La/qg40;

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    const/4 v2, 0x5

    .line 31
    invoke-direct {v12, v1, v2}, La/qg40;-><init>(II)V

    .line 32
    .line 33
    .line 34
    const-string v8, "FROM_2_TO_5"

    .line 35
    .line 36
    const/4 v9, 0x1

    .line 37
    const-string v10, "from2"

    .line 38
    .line 39
    const v11, 0x7f130914

    .line 40
    .line 41
    .line 42
    invoke-direct/range {v7 .. v12}, La/m4s;-><init>(Ljava/lang/String;ILjava/lang/String;ILa/qg40;)V

    .line 43
    .line 44
    .line 45
    new-instance v8, La/m4s;

    .line 46
    .line 47
    new-instance v13, La/qg40;

    .line 48
    .line 49
    const/16 v1, 0x32

    .line 50
    .line 51
    invoke-direct {v13, v2, v1}, La/qg40;-><init>(II)V

    .line 52
    .line 53
    .line 54
    const-string v9, "FROM_5_TO_50"

    .line 55
    .line 56
    const/4 v10, 0x2

    .line 57
    const-string v11, "from10"

    .line 58
    .line 59
    const v12, 0x7f130912

    .line 60
    .line 61
    .line 62
    invoke-direct/range {v8 .. v13}, La/m4s;-><init>(Ljava/lang/String;ILjava/lang/String;ILa/qg40;)V

    .line 63
    .line 64
    .line 65
    new-instance v9, La/m4s;

    .line 66
    .line 67
    new-instance v14, La/qg40;

    .line 68
    .line 69
    invoke-direct {v14, v1, v6}, La/qg40;-><init>(II)V

    .line 70
    .line 71
    .line 72
    const-string v10, "FROM_50_TO_MAX"

    .line 73
    .line 74
    const/4 v11, 0x3

    .line 75
    const-string v12, "from100"

    .line 76
    .line 77
    const v13, 0x7f130913

    .line 78
    .line 79
    .line 80
    invoke-direct/range {v9 .. v14}, La/m4s;-><init>(Ljava/lang/String;ILjava/lang/String;ILa/qg40;)V

    .line 81
    .line 82
    .line 83
    filled-new-array {v0, v7, v8, v9}, [La/m4s;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, La/m4s;->f:[La/m4s;

    .line 88
    .line 89
    new-instance v1, La/c0o;

    .line 90
    .line 91
    invoke-direct {v1, v0}, La/c0o;-><init>([Ljava/lang/Enum;)V

    .line 92
    .line 93
    .line 94
    sput-object v1, La/m4s;->g:La/c0o;

    .line 95
    .line 96
    new-instance v0, La/ddk;

    .line 97
    .line 98
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 99
    .line 100
    .line 101
    sput-object v0, La/m4s;->d:La/ddk;

    .line 102
    .line 103
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;ILa/qg40;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, La/m4s;->a:Ljava/lang/String;

    .line 5
    .line 6
    iput p4, p0, La/m4s;->b:I

    .line 7
    .line 8
    iput-object p5, p0, La/m4s;->c:La/qg40;

    .line 9
    .line 10
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/m4s;
    .locals 1

    .line 1
    const-class v0, La/m4s;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/m4s;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/m4s;
    .locals 1

    .line 1
    sget-object v0, La/m4s;->f:[La/m4s;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/m4s;

    .line 8
    .line 9
    return-object v0
.end method
