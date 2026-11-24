.class public final La/htt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/cu;

.field public final b:La/k7u;


# direct methods
.method public constructor <init>(La/cu;La/k7u;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/htt;->a:La/cu;

    .line 8
    .line 9
    iput-object p2, p0, La/htt;->b:La/k7u;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(JJLjava/lang/String;)La/lhf0;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, La/htt;->b:La/k7u;

    .line 3
    .line 4
    iget-object p0, p0, La/htt;->a:La/cu;

    .line 5
    .line 6
    if-nez p5, :cond_0

    .line 7
    .line 8
    new-instance v2, La/vb7;

    .line 9
    .line 10
    iget-object p5, v1, La/k7u;->a:La/uzc;

    .line 11
    .line 12
    invoke-virtual {p5}, La/uzc;->b()La/jvn;

    .line 13
    .line 14
    .line 15
    move-result-object p5

    .line 16
    invoke-virtual {p5}, La/jvn;->getId()I

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    move-wide v4, p1

    .line 21
    move-wide v6, p3

    .line 22
    invoke-direct/range {v2 .. v7}, La/vb7;-><init>(IJJ)V

    .line 23
    .line 24
    .line 25
    new-instance p1, La/lhf0;

    .line 26
    .line 27
    new-instance p2, La/gst;

    .line 28
    .line 29
    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    .line 30
    .line 31
    .line 32
    new-instance p3, La/u47;

    .line 33
    .line 34
    const/16 p4, 0xa

    .line 35
    .line 36
    invoke-direct {p3, p0, v2, v0, p4}, La/u47;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p1, p2, p3}, La/lhf0;-><init>(La/gm80;Lkotlin/jvm/functions/Function2;)V

    .line 40
    .line 41
    .line 42
    return-object p1

    .line 43
    :cond_0
    move-wide v4, p1

    .line 44
    new-instance p1, La/ub7;

    .line 45
    .line 46
    iget-object p2, v1, La/k7u;->a:La/uzc;

    .line 47
    .line 48
    invoke-virtual {p2}, La/uzc;->b()La/jvn;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    invoke-virtual {p2}, La/jvn;->getId()I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    invoke-direct {p1, p5, p2, v4, v5}, La/ub7;-><init>(Ljava/lang/String;IJ)V

    .line 57
    .line 58
    .line 59
    new-instance p2, La/lhf0;

    .line 60
    .line 61
    new-instance p3, La/gst;

    .line 62
    .line 63
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 64
    .line 65
    .line 66
    new-instance p4, La/u47;

    .line 67
    .line 68
    const/16 p5, 0x9

    .line 69
    .line 70
    invoke-direct {p4, p0, p1, v0, p5}, La/u47;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 71
    .line 72
    .line 73
    invoke-direct {p2, p3, p4}, La/lhf0;-><init>(La/gm80;Lkotlin/jvm/functions/Function2;)V

    .line 74
    .line 75
    .line 76
    return-object p2
.end method
