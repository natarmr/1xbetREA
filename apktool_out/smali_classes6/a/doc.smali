.class public final La/doc;
.super La/eys0;
.source "SourceFile"


# instance fields
.field public final synthetic a:La/eoc;

.field public final synthetic b:La/xzs0;


# direct methods
.method public constructor <init>(La/eoc;La/xzs0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/doc;->a:La/eoc;

    .line 5
    .line 6
    iput-object p2, p0, La/doc;->b:La/xzs0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final n(La/gys0;La/aty;)La/dcg0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    iget-object p1, p0, La/doc;->a:La/eoc;

    .line 8
    .line 9
    invoke-interface {p1, p2}, La/yzs0;->m0(La/aty;)La/dcg0;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    check-cast p2, La/wsy;

    .line 14
    .line 15
    sget-object v0, La/t3u0;->c:La/t3u0;

    .line 16
    .line 17
    iget-object p0, p0, La/doc;->b:La/xzs0;

    .line 18
    .line 19
    invoke-virtual {p0, p2, v0}, La/xzs0;->f(La/wsy;La/t3u0;)La/wsy;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    invoke-interface {p1, p0}, La/eoc;->r(La/wsy;)La/kzj0;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    return-object p0
.end method
