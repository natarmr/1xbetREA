.class public final La/yn00;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/d3c;

.field public final b:La/fq;

.field public final c:La/bpi0;

.field public final d:La/pmi;

.field public final e:La/wsf0;

.field public final f:La/gst0;


# direct methods
.method public constructor <init>(La/d3c;La/fq;La/bpi0;La/pmi;La/wsf0;La/gst0;)V
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
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, La/yn00;->a:La/d3c;

    .line 14
    .line 15
    iput-object p2, p0, La/yn00;->b:La/fq;

    .line 16
    .line 17
    iput-object p3, p0, La/yn00;->c:La/bpi0;

    .line 18
    .line 19
    iput-object p4, p0, La/yn00;->d:La/pmi;

    .line 20
    .line 21
    iput-object p5, p0, La/yn00;->e:La/wsf0;

    .line 22
    .line 23
    iput-object p6, p0, La/yn00;->f:La/gst0;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final a(JZJ)La/gmq;
    .locals 10

    .line 1
    new-instance v0, La/fsu;

    .line 2
    .line 3
    const/4 v7, 0x0

    .line 4
    move-object v3, p0

    .line 5
    move-wide v1, p1

    .line 6
    move v4, p3

    .line 7
    move-wide v5, p4

    .line 8
    invoke-direct/range {v0 .. v7}, La/fsu;-><init>(JLa/yn00;ZJLa/yje;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, La/vsg0;

    .line 12
    .line 13
    invoke-direct {v1, v0}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 14
    .line 15
    .line 16
    const-class p0, La/oqt0;

    .line 17
    .line 18
    const-class p1, La/zhi0;

    .line 19
    .line 20
    filled-new-array {p0, p1}, [Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v6

    .line 28
    const/4 v8, 0x0

    .line 29
    const/16 v9, 0x36

    .line 30
    .line 31
    const-string v2, "loadFactors"

    .line 32
    .line 33
    const/4 v3, 0x0

    .line 34
    const-wide/16 v4, 0x0

    .line 35
    .line 36
    invoke-static/range {v1 .. v9}, La/bkb;->i0(La/gmq;Ljava/lang/String;IJLjava/util/List;Ljava/util/List;Lkotlin/jvm/functions/Function1;I)La/a1g;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, La/i120;->W(La/gmq;)La/gmq;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0
.end method
