.class public final La/hzt;
.super La/zje;
.source "SourceFile"


# instance fields
.field public A:Z

.field public synthetic B:Ljava/lang/Object;

.field public final synthetic Y:La/tzi;

.field public Z:I

.field public i:Ljava/util/List;

.field public j:Ljava/util/List;

.field public k:Ljava/util/List;

.field public l:La/q4f;

.field public m:Ljava/util/List;

.field public n:Ljava/util/Map;

.field public o:La/cit0;

.field public p:Ljava/util/Collection;

.field public q:Ljava/util/Iterator;

.field public r:Ljava/util/List;

.field public s:Ljava/util/List;

.field public t:Ljava/util/List;

.field public u:Ljava/util/List;

.field public v:La/tzi;

.field public w:La/vb9;

.field public x:La/p0g0;

.field public y:La/p0g0;

.field public z:Ljava/util/Collection;


# direct methods
.method public constructor <init>(La/tzi;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/hzt;->Y:La/tzi;

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
    .locals 10

    .line 1
    iput-object p1, p0, La/hzt;->B:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/hzt;->Z:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/hzt;->Z:I

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const/4 v8, 0x0

    .line 12
    iget-object v0, p0, La/hzt;->Y:La/tzi;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    const/4 v5, 0x0

    .line 19
    const/4 v6, 0x0

    .line 20
    move-object v9, p0

    .line 21
    invoke-virtual/range {v0 .. v9}, La/tzi;->q(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;La/q4f;ZLjava/util/List;Ljava/util/LinkedHashMap;La/zje;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
