.class public final La/xqg0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field public A:Ljava/lang/Float;

.field public B:La/grg0;

.field public Y:Ljava/lang/Float;

.field public Z:I

.field public a:J

.field public b:La/grg0;

.field public c:Ljava/lang/Float;

.field public d:La/grg0;

.field public e:Ljava/lang/Float;

.field public f:La/jqg0;

.field public f1:I

.field public g:Ljava/lang/Float;

.field public g1:I

.field public h:[La/jqg0;

.field public h1:I

.field public i:La/jqg0;

.field public i1:I

.field public j:Ljava/lang/Float;

.field public j1:I

.field public k:La/aqg0;

.field public k1:I

.field public l:Ljava/util/ArrayList;

.field public l1:I

.field public m:La/jqg0;

.field public m1:I

.field public n:Ljava/lang/Integer;

.field public n1:I

.field public o:Ljava/lang/Boolean;

.field public p:La/n660;

.field public q:Ljava/lang/String;

.field public r:Ljava/lang/String;

.field public s:Ljava/lang/String;

.field public t:Ljava/lang/Boolean;

.field public u:Ljava/lang/Boolean;

.field public v:La/grg0;

.field public w:Ljava/lang/Float;

.field public x:Ljava/lang/String;

.field public y:Ljava/lang/String;

.field public z:La/grg0;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    iput-wide v0, p0, La/xqg0;->a:J

    .line 7
    .line 8
    return-void
.end method

.method public static a()La/xqg0;
    .locals 8

    .line 1
    new-instance v0, La/xqg0;

    .line 2
    .line 3
    invoke-direct {v0}, La/xqg0;-><init>()V

    .line 4
    .line 5
    .line 6
    const-wide/16 v1, -0x1

    .line 7
    .line 8
    iput-wide v1, v0, La/xqg0;->a:J

    .line 9
    .line 10
    sget-object v1, La/aqg0;->b:La/aqg0;

    .line 11
    .line 12
    iput-object v1, v0, La/xqg0;->b:La/grg0;

    .line 13
    .line 14
    const/4 v2, 0x1

    .line 15
    iput v2, v0, La/xqg0;->Z:I

    .line 16
    .line 17
    const/high16 v3, 0x3f800000    # 1.0f

    .line 18
    .line 19
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    iput-object v4, v0, La/xqg0;->c:Ljava/lang/Float;

    .line 24
    .line 25
    const/4 v5, 0x0

    .line 26
    iput-object v5, v0, La/xqg0;->d:La/grg0;

    .line 27
    .line 28
    iput-object v4, v0, La/xqg0;->e:Ljava/lang/Float;

    .line 29
    .line 30
    new-instance v6, La/jqg0;

    .line 31
    .line 32
    invoke-direct {v6, v3}, La/jqg0;-><init>(F)V

    .line 33
    .line 34
    .line 35
    iput-object v6, v0, La/xqg0;->f:La/jqg0;

    .line 36
    .line 37
    iput v2, v0, La/xqg0;->f1:I

    .line 38
    .line 39
    iput v2, v0, La/xqg0;->g1:I

    .line 40
    .line 41
    const/high16 v3, 0x40800000    # 4.0f

    .line 42
    .line 43
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    iput-object v3, v0, La/xqg0;->g:Ljava/lang/Float;

    .line 48
    .line 49
    iput-object v5, v0, La/xqg0;->h:[La/jqg0;

    .line 50
    .line 51
    new-instance v3, La/jqg0;

    .line 52
    .line 53
    const/4 v6, 0x0

    .line 54
    invoke-direct {v3, v6}, La/jqg0;-><init>(F)V

    .line 55
    .line 56
    .line 57
    iput-object v3, v0, La/xqg0;->i:La/jqg0;

    .line 58
    .line 59
    iput-object v4, v0, La/xqg0;->j:Ljava/lang/Float;

    .line 60
    .line 61
    iput-object v1, v0, La/xqg0;->k:La/aqg0;

    .line 62
    .line 63
    iput-object v5, v0, La/xqg0;->l:Ljava/util/ArrayList;

    .line 64
    .line 65
    new-instance v3, La/jqg0;

    .line 66
    .line 67
    const/high16 v6, 0x41400000    # 12.0f

    .line 68
    .line 69
    const/4 v7, 0x7

    .line 70
    invoke-direct {v3, v6, v7}, La/jqg0;-><init>(FI)V

    .line 71
    .line 72
    .line 73
    iput-object v3, v0, La/xqg0;->m:La/jqg0;

    .line 74
    .line 75
    const/16 v3, 0x190

    .line 76
    .line 77
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    iput-object v3, v0, La/xqg0;->n:Ljava/lang/Integer;

    .line 82
    .line 83
    iput v2, v0, La/xqg0;->h1:I

    .line 84
    .line 85
    iput v2, v0, La/xqg0;->i1:I

    .line 86
    .line 87
    iput v2, v0, La/xqg0;->j1:I

    .line 88
    .line 89
    iput v2, v0, La/xqg0;->k1:I

    .line 90
    .line 91
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 92
    .line 93
    iput-object v3, v0, La/xqg0;->o:Ljava/lang/Boolean;

    .line 94
    .line 95
    iput-object v5, v0, La/xqg0;->p:La/n660;

    .line 96
    .line 97
    iput-object v5, v0, La/xqg0;->q:Ljava/lang/String;

    .line 98
    .line 99
    iput-object v5, v0, La/xqg0;->r:Ljava/lang/String;

    .line 100
    .line 101
    iput-object v5, v0, La/xqg0;->s:Ljava/lang/String;

    .line 102
    .line 103
    iput-object v3, v0, La/xqg0;->t:Ljava/lang/Boolean;

    .line 104
    .line 105
    iput-object v3, v0, La/xqg0;->u:Ljava/lang/Boolean;

    .line 106
    .line 107
    iput-object v1, v0, La/xqg0;->v:La/grg0;

    .line 108
    .line 109
    iput-object v4, v0, La/xqg0;->w:Ljava/lang/Float;

    .line 110
    .line 111
    iput-object v5, v0, La/xqg0;->x:Ljava/lang/String;

    .line 112
    .line 113
    iput v2, v0, La/xqg0;->l1:I

    .line 114
    .line 115
    iput-object v5, v0, La/xqg0;->y:Ljava/lang/String;

    .line 116
    .line 117
    iput-object v5, v0, La/xqg0;->z:La/grg0;

    .line 118
    .line 119
    iput-object v4, v0, La/xqg0;->A:Ljava/lang/Float;

    .line 120
    .line 121
    iput-object v5, v0, La/xqg0;->B:La/grg0;

    .line 122
    .line 123
    iput-object v4, v0, La/xqg0;->Y:Ljava/lang/Float;

    .line 124
    .line 125
    iput v2, v0, La/xqg0;->m1:I

    .line 126
    .line 127
    iput v2, v0, La/xqg0;->n1:I

    .line 128
    .line 129
    return-object v0
.end method


# virtual methods
.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, La/xqg0;

    .line 6
    .line 7
    iget-object p0, p0, La/xqg0;->h:[La/jqg0;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    invoke-virtual {p0}, [La/jqg0;->clone()Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, [La/jqg0;

    .line 16
    .line 17
    iput-object p0, v0, La/xqg0;->h:[La/jqg0;

    .line 18
    .line 19
    :cond_0
    return-object v0
.end method
