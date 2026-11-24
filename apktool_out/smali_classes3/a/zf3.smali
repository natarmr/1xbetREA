.class public final La/zf3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/zjh0;


# instance fields
.field public final a:La/us00;

.field public final b:La/knf0;

.field public final c:La/z8w0;

.field public final d:La/mmy;

.field public final e:La/n0o0;


# direct methods
.method public constructor <init>(La/us00;La/knf0;La/z8w0;La/mmy;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/zf3;->a:La/us00;

    .line 5
    .line 6
    iput-object p2, p0, La/zf3;->b:La/knf0;

    .line 7
    .line 8
    iput-object p3, p0, La/zf3;->c:La/z8w0;

    .line 9
    .line 10
    iput-object p4, p0, La/zf3;->d:La/mmy;

    .line 11
    .line 12
    new-instance p1, La/a13;

    .line 13
    .line 14
    const/16 p2, 0x9

    .line 15
    .line 16
    invoke-direct {p1, p0, p2}, La/a13;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, La/zf3;->e:La/n0o0;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 7

    .line 1
    instance-of v0, p1, La/yf3;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/yf3;

    .line 7
    .line 8
    iget v1, v0, La/yf3;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/yf3;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/yf3;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/yf3;-><init>(La/zf3;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/yf3;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/yf3;->l:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object p1

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    iget-object p0, v0, La/yf3;->i:La/z8w0;

    .line 51
    .line 52
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_3
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object p1, p0, La/zf3;->c:La/z8w0;

    .line 60
    .line 61
    iput-object p1, v0, La/yf3;->i:La/z8w0;

    .line 62
    .line 63
    iput v5, v0, La/yf3;->l:I

    .line 64
    .line 65
    iget-object p0, p0, La/zf3;->d:La/mmy;

    .line 66
    .line 67
    check-cast p0, Lorg/xplatform/secret/impl/KeysImpl;

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Lorg/xplatform/secret/impl/KeysImpl;->e(La/zje;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    if-ne p0, v1, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    move-object v6, p1

    .line 77
    move-object p1, p0

    .line 78
    move-object p0, v6

    .line 79
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 80
    .line 81
    iput-object v3, v0, La/yf3;->i:La/z8w0;

    .line 82
    .line 83
    iput v4, v0, La/yf3;->l:I

    .line 84
    .line 85
    invoke-static {p0, p1, v0}, La/z8w0;->e(La/z8w0;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-ne p0, v1, :cond_5

    .line 90
    .line 91
    :goto_2
    return-object v1

    .line 92
    :cond_5
    return-object p0
.end method
