.class public final La/cyh;
.super Ljava/lang/Object;


# instance fields
.field public final a:La/d5w0;

.field public final b:La/b5w0;

.field public final c:La/bwt;

.field public final d:La/izx;

.field public final e:La/y2w0;


# direct methods
.method public constructor <init>(La/d5w0;La/b5w0;La/bwt;La/izx;La/wo10;La/f5w0;La/y2w0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/cyh;->a:La/d5w0;

    .line 5
    .line 6
    iput-object p2, p0, La/cyh;->b:La/b5w0;

    .line 7
    .line 8
    iput-object p3, p0, La/cyh;->c:La/bwt;

    .line 9
    .line 10
    iput-object p4, p0, La/cyh;->d:La/izx;

    .line 11
    .line 12
    iput-object p7, p0, La/cyh;->e:La/y2w0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final a(La/v0;)La/p5a;
    .locals 3

    .line 1
    new-instance v0, La/y4j;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p0, p1, v1}, La/y4j;-><init>(La/cyh;La/v0;La/yje;)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, La/nkb;->z(Lkotlin/jvm/functions/Function2;)La/ltb;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-instance v0, La/gbv;

    .line 12
    .line 13
    const/4 v2, 0x2

    .line 14
    invoke-direct {v0, p0, v1, v2}, La/gbv;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 15
    .line 16
    .line 17
    new-instance p0, La/dnq;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {p0, p1, v0, v1}, La/dnq;-><init>(La/gmq;La/xdr;B)V

    .line 21
    .line 22
    .line 23
    invoke-static {p0}, La/ulb;->H(La/gmq;)La/p5a;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
