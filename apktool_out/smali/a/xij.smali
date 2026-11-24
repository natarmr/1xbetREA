.class public final La/xij;
.super La/f3k;
.source "SourceFile"

# interfaces
.implements La/gpa0;


# instance fields
.field public q:La/ltc;

.field public final r:La/jnn0;


# direct methods
.method public constructor <init>(La/ltc;)V
    .locals 2

    .line 1
    invoke-direct {p0}, La/f3k;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/xij;->q:La/ltc;

    .line 5
    .line 6
    new-instance p1, La/zy2;

    .line 7
    .line 8
    const/4 v0, 0x1

    .line 9
    invoke-direct {p1, p0, v0}, La/zy2;-><init>(Ljava/lang/Object;B)V

    .line 10
    .line 11
    .line 12
    sget-object v0, La/fnn0;->a:La/woa0;

    .line 13
    .line 14
    new-instance v0, La/jnn0;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-direct {v0, v1, v1, p1}, La/jnn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, La/f3k;->Z0(La/yzj;)La/yzj;

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, La/xij;->r:La/jnn0;

    .line 24
    .line 25
    return-void
.end method


# virtual methods
.method public final h(La/woa0;La/xoa0;J)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, La/xij;->r:La/jnn0;

    .line 5
    .line 6
    invoke-virtual {p0, p1, p2, p3, p4}, La/jnn0;->h(La/woa0;La/xoa0;J)V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public final n0()V
    .locals 0

    .line 1
    iget-object p0, p0, La/xij;->r:La/jnn0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/jnn0;->n0()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
