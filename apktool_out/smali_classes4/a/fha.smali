.class public final enum La/fha;
.super Ljava/lang/Enum;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final c:La/bj5;

.field public static final enum d:La/fha;

.field public static final enum e:La/fha;

.field public static final enum f:La/fha;

.field public static final enum g:La/fha;

.field public static final enum h:La/fha;

.field public static final enum i:La/fha;

.field public static final enum j:La/fha;

.field public static final synthetic k:[La/fha;


# instance fields
.field public final a:B

.field public final b:B


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, La/fha;

    .line 2
    .line 3
    const-string v1, "TIME_OUT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v2, v2, v2, v1}, La/fha;-><init>(IIILjava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, La/fha;->d:La/fha;

    .line 10
    .line 11
    new-instance v1, La/fha;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const-string v3, "FIRST_ATTACK"

    .line 15
    .line 16
    invoke-direct {v1, v2, v2, v2, v3}, La/fha;-><init>(IIILjava/lang/String;)V

    .line 17
    .line 18
    .line 19
    sput-object v1, La/fha;->e:La/fha;

    .line 20
    .line 21
    move v3, v2

    .line 22
    new-instance v2, La/fha;

    .line 23
    .line 24
    const/4 v4, 0x2

    .line 25
    const-string v5, "SECOND_ATTACK"

    .line 26
    .line 27
    invoke-direct {v2, v4, v4, v3, v5}, La/fha;-><init>(IIILjava/lang/String;)V

    .line 28
    .line 29
    .line 30
    sput-object v2, La/fha;->f:La/fha;

    .line 31
    .line 32
    move v5, v3

    .line 33
    new-instance v3, La/fha;

    .line 34
    .line 35
    const/4 v6, 0x3

    .line 36
    const-string v7, "THIRD_ATTACK"

    .line 37
    .line 38
    invoke-direct {v3, v6, v6, v5, v7}, La/fha;-><init>(IIILjava/lang/String;)V

    .line 39
    .line 40
    .line 41
    sput-object v3, La/fha;->g:La/fha;

    .line 42
    .line 43
    move v7, v4

    .line 44
    new-instance v4, La/fha;

    .line 45
    .line 46
    const-string v8, "FORTH_ATTACK"

    .line 47
    .line 48
    const/4 v9, 0x4

    .line 49
    invoke-direct {v4, v9, v5, v7, v8}, La/fha;-><init>(IIILjava/lang/String;)V

    .line 50
    .line 51
    .line 52
    sput-object v4, La/fha;->h:La/fha;

    .line 53
    .line 54
    new-instance v5, La/fha;

    .line 55
    .line 56
    const-string v8, "FIFTH_ATTACK"

    .line 57
    .line 58
    const/4 v9, 0x5

    .line 59
    invoke-direct {v5, v9, v7, v7, v8}, La/fha;-><init>(IIILjava/lang/String;)V

    .line 60
    .line 61
    .line 62
    sput-object v5, La/fha;->i:La/fha;

    .line 63
    .line 64
    move v8, v6

    .line 65
    new-instance v6, La/fha;

    .line 66
    .line 67
    const-string v9, "SIXTH_ATTACK"

    .line 68
    .line 69
    const/4 v10, 0x6

    .line 70
    invoke-direct {v6, v10, v8, v7, v9}, La/fha;-><init>(IIILjava/lang/String;)V

    .line 71
    .line 72
    .line 73
    sput-object v6, La/fha;->j:La/fha;

    .line 74
    .line 75
    filled-new-array/range {v0 .. v6}, [La/fha;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, La/fha;->k:[La/fha;

    .line 80
    .line 81
    new-instance v0, La/c0o;

    .line 82
    .line 83
    new-instance v0, La/bj5;

    .line 84
    .line 85
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 86
    .line 87
    .line 88
    sput-object v0, La/fha;->c:La/bj5;

    .line 89
    .line 90
    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0, p4, p1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-byte p2, p0, La/fha;->a:B

    .line 5
    .line 6
    iput-byte p3, p0, La/fha;->b:B

    .line 7
    .line 8
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)La/fha;
    .locals 1

    .line 1
    const-class v0, La/fha;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/fha;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[La/fha;
    .locals 1

    .line 1
    sget-object v0, La/fha;->k:[La/fha;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [La/fha;

    .line 8
    .line 9
    return-object v0
.end method
