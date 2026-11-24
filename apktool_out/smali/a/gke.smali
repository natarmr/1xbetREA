.class public final La/gke;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/vt00;

.field public j:La/vt00;

.field public k:La/z40;

.field public l:Ljava/lang/Long;

.field public m:La/mie0;

.field public n:La/l0g0;

.field public o:B

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:La/hke;

.field public r:I


# direct methods
.method public constructor <init>(La/hke;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/gke;->q:La/hke;

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
    .locals 13

    .line 1
    iput-object p1, p0, La/gke;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/gke;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/gke;->r:I

    .line 9
    .line 10
    const/4 v10, 0x0

    .line 11
    const/4 v11, 0x0

    .line 12
    iget-object v0, p0, La/gke;->q:La/hke;

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
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    move-object v12, p0

    .line 24
    invoke-virtual/range {v0 .. v12}, La/hke;->a(Ljava/util/List;Ljava/util/List;Ljava/util/List;La/vt00;La/vt00;La/vt00;La/z40;Lkotlin/jvm/functions/Function1;ILjava/lang/Long;Ljava/lang/Long;La/zje;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method
