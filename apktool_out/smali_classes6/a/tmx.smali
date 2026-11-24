.class public final La/tmx;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:La/pz40;

.field public final synthetic c:La/pz40;


# direct methods
.method public constructor <init>(JLa/pz40;La/pz40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/tmx;->a:J

    .line 5
    .line 6
    iput-object p3, p0, La/tmx;->b:La/pz40;

    .line 7
    .line 8
    iput-object p4, p0, La/tmx;->c:La/pz40;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(La/hpa0;La/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    new-instance v0, La/my2;

    .line 2
    .line 3
    const/4 v5, 0x7

    .line 4
    iget-object v1, p0, La/tmx;->b:La/pz40;

    .line 5
    .line 6
    iget-wide v2, p0, La/tmx;->a:J

    .line 7
    .line 8
    iget-object v4, p0, La/tmx;->c:La/pz40;

    .line 9
    .line 10
    invoke-direct/range {v0 .. v5}, La/my2;-><init>(Ljava/lang/Object;JLjava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1, v0, p2}, La/bel;->f(La/hpa0;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

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
