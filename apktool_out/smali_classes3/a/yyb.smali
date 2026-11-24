.class public final La/yyb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/k1u;

.field public final b:La/gmt;

.field public final c:La/ztt;

.field public final d:La/pbt;


# direct methods
.method public constructor <init>(La/k1u;La/gmt;La/ztt;La/pbt;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/yyb;->a:La/k1u;

    .line 17
    .line 18
    iput-object p2, p0, La/yyb;->b:La/gmt;

    .line 19
    .line 20
    iput-object p3, p0, La/yyb;->c:La/ztt;

    .line 21
    .line 22
    iput-object p4, p0, La/yyb;->d:La/pbt;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(DD)La/an7;
    .locals 3

    .line 1
    iget-object v0, p0, La/yyb;->a:La/k1u;

    .line 2
    .line 3
    invoke-virtual {v0}, La/k1u;->a()D

    .line 4
    .line 5
    .line 6
    move-result-wide v0

    .line 7
    cmpl-double v0, v0, p1

    .line 8
    .line 9
    if-ltz v0, :cond_4

    .line 10
    .line 11
    iget-object v0, p0, La/yyb;->c:La/ztt;

    .line 12
    .line 13
    invoke-virtual {v0}, La/ztt;->a()La/csr;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v1, v1, La/csr;->a:La/bsr;

    .line 18
    .line 19
    iget-object v1, v1, La/bsr;->a:La/esr;

    .line 20
    .line 21
    sget-object v2, La/esr;->f:La/esr;

    .line 22
    .line 23
    if-eq v1, v2, :cond_1

    .line 24
    .line 25
    cmpg-double v1, p1, p3

    .line 26
    .line 27
    if-gtz v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v1, p0, La/yyb;->d:La/pbt;

    .line 31
    .line 32
    iget-object v1, v1, La/pbt;->a:La/j5t;

    .line 33
    .line 34
    iget-boolean v1, v1, La/j5t;->v:Z

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    iget-object p0, p0, La/yyb;->b:La/gmt;

    .line 39
    .line 40
    invoke-virtual {p0}, La/gmt;->a()La/ql5;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-eqz p0, :cond_1

    .line 45
    .line 46
    iget-object p0, p0, La/ql5;->i:La/txs0;

    .line 47
    .line 48
    invoke-virtual {p0}, La/txs0;->a()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    const/4 v1, 0x1

    .line 53
    if-ne p0, v1, :cond_1

    .line 54
    .line 55
    sget-object p0, La/an7;->d:La/an7;

    .line 56
    .line 57
    return-object p0

    .line 58
    :cond_1
    :goto_0
    invoke-virtual {v0}, La/ztt;->a()La/csr;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    iget-object p0, p0, La/csr;->a:La/bsr;

    .line 63
    .line 64
    iget-object p0, p0, La/bsr;->a:La/esr;

    .line 65
    .line 66
    if-eq p0, v2, :cond_3

    .line 67
    .line 68
    cmpg-double p0, p1, p3

    .line 69
    .line 70
    if-gtz p0, :cond_2

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_2
    sget-object p0, La/an7;->b:La/an7;

    .line 74
    .line 75
    return-object p0

    .line 76
    :cond_3
    :goto_1
    sget-object p0, La/an7;->a:La/an7;

    .line 77
    .line 78
    return-object p0

    .line 79
    :cond_4
    sget-object p0, La/an7;->c:La/an7;

    .line 80
    .line 81
    return-object p0
.end method
