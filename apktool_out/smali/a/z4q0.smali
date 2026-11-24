.class public final La/z4q0;
.super La/f3k;
.source "SourceFile"

# interfaces
.implements La/vld;
.implements La/t7v;


# instance fields
.field public q:La/e7q0;

.field public final r:La/pz40;


# direct methods
.method public constructor <init>(La/e7q0;)V
    .locals 2

    .line 1
    invoke-direct {p0}, La/f3k;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/z4q0;->q:La/e7q0;

    .line 5
    .line 6
    sget-object p1, La/m2a;->v:La/m2a;

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    invoke-static {v0, p1}, Landroidx/compose/runtime/e;->d(Ljava/lang/Object;La/igk0;)La/pz40;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    iput-object p1, p0, La/z4q0;->r:La/pz40;

    .line 14
    .line 15
    new-instance p1, La/zy2;

    .line 16
    .line 17
    const/16 v1, 0x8

    .line 18
    .line 19
    invoke-direct {p1, p0, v1}, La/zy2;-><init>(Ljava/lang/Object;B)V

    .line 20
    .line 21
    .line 22
    sget-object v1, La/fnn0;->a:La/woa0;

    .line 23
    .line 24
    new-instance v1, La/jnn0;

    .line 25
    .line 26
    invoke-direct {v1, v0, v0, p1}, La/jnn0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1}, La/f3k;->Z0(La/yzj;)La/yzj;

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public final P(La/s460;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/z4q0;->r:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
