.class public final La/je70;
.super La/zje;
.source "SourceFile"


# instance fields
.field public A:I

.field public i:La/qpg0;

.field public j:La/zjo0;

.field public k:La/zjo0;

.field public l:La/zjo0;

.field public m:La/zjo0;

.field public n:La/zjo0;

.field public o:La/zjo0;

.field public p:La/zjo0;

.field public q:La/zjo0;

.field public r:La/zjo0;

.field public s:La/zjo0;

.field public t:La/zjo0;

.field public u:La/zjo0;

.field public v:La/zjo0;

.field public w:La/zjo0;

.field public x:La/zjo0;

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:La/ke70;


# direct methods
.method public constructor <init>(La/ke70;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/je70;->z:La/ke70;

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
    iput-object p1, p0, La/je70;->y:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/je70;->A:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/je70;->A:I

    .line 9
    .line 10
    iget-object p1, p0, La/je70;->z:La/ke70;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, La/ke70;->b(La/qpg0;La/zje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
