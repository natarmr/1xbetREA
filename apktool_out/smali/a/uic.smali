.class public final La/uic;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:La/cgk0;

.field public final synthetic c:La/pz40;


# direct methods
.method public constructor <init>(ZLa/cgk0;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, La/uic;->a:Z

    .line 5
    .line 6
    iput-object p2, p0, La/uic;->b:La/cgk0;

    .line 7
    .line 8
    iput-object p3, p0, La/uic;->c:La/pz40;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(La/hpa0;La/yje;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, La/tic;

    .line 2
    .line 3
    iget-object v1, p0, La/uic;->c:La/pz40;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-boolean v3, p0, La/uic;->a:Z

    .line 7
    .line 8
    iget-object p0, p0, La/uic;->b:La/cgk0;

    .line 9
    .line 10
    invoke-direct {v0, v3, p0, v1, v2}, La/tic;-><init>(ZLa/cgk0;La/pz40;La/yje;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0, p2}, La/ebc;->Y(La/hpa0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    sget-object p1, La/wne;->a:La/wne;

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 23
    .line 24
    return-object p0
.end method
