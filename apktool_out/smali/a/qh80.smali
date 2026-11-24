.class public final La/qh80;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Lkotlin/jvm/functions/Function2;

.field public j:La/rh80;

.field public k:La/gp00;

.field public l:Ljava/util/Collection;

.field public m:Ljava/util/Iterator;

.field public n:La/kls0;

.field public o:[I

.field public p:Ljava/util/Collection;

.field public q:Ljava/util/Iterator;

.field public r:Ljava/util/Collection;

.field public s:Ljava/util/Collection;

.field public synthetic t:Ljava/lang/Object;

.field public final synthetic u:La/rh80;

.field public v:I


# direct methods
.method public constructor <init>(La/rh80;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/qh80;->u:La/rh80;

    .line 2
    .line 3
    invoke-direct {p0, p2}, La/zje;-><init>(La/yje;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iput-object p1, p0, La/qh80;->t:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/qh80;->v:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/qh80;->v:I

    .line 9
    .line 10
    iget-object p1, p0, La/qh80;->u:La/rh80;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, p0, v0}, La/rh80;->b(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
