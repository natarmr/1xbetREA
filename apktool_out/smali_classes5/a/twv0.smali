.class public final La/twv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/compose/ui/input/pointer/PointerInputEventHandler;


# instance fields
.field public final synthetic a:La/lsv0;

.field public final synthetic b:La/ywv0;

.field public final synthetic c:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(La/lsv0;La/ywv0;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/twv0;->a:La/lsv0;

    .line 5
    .line 6
    iput-object p2, p0, La/twv0;->b:La/ywv0;

    .line 7
    .line 8
    iput-object p3, p0, La/twv0;->c:Lkotlin/jvm/functions/Function0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(La/hpa0;La/yje;)Ljava/lang/Object;
    .locals 4

    .line 1
    new-instance v0, La/m8s0;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    iget-object v2, p0, La/twv0;->a:La/lsv0;

    .line 6
    .line 7
    iget-object v3, p0, La/twv0;->b:La/ywv0;

    .line 8
    .line 9
    iget-object p0, p0, La/twv0;->c:Lkotlin/jvm/functions/Function0;

    .line 10
    .line 11
    invoke-direct {v0, v2, v3, p0, v1}, La/m8s0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x7

    .line 15
    invoke-static {p1, v0, p2, p0}, La/tto0;->d(La/hpa0;Lkotlin/jvm/functions/Function1;La/yje;I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    sget-object p1, La/wne;->a:La/wne;

    .line 20
    .line 21
    if-ne p0, p1, :cond_0

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 25
    .line 26
    return-object p0
.end method
