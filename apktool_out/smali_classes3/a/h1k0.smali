.class public final La/h1k0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Ljava/util/Collection;

.field public j:Ljava/util/Iterator;

.field public k:La/j1k0;

.field public l:La/d0t;

.field public m:Ljava/util/Collection;

.field public n:La/j1k0;

.field public o:Ljava/util/Collection;

.field public p:I

.field public q:Z

.field public r:Z

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:La/i1k0;

.field public u:I


# direct methods
.method public constructor <init>(La/i1k0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/h1k0;->t:La/i1k0;

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
    iput-object p1, p0, La/h1k0;->s:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/h1k0;->u:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/h1k0;->u:I

    .line 9
    .line 10
    iget-object p1, p0, La/h1k0;->t:La/i1k0;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, La/i1k0;->a(Ljava/util/List;La/zje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
