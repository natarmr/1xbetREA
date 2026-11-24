.class public final La/q8e;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/pei0;

.field public j:La/gxb;

.field public k:Ljava/util/ArrayList;

.field public l:Ljava/util/Collection;

.field public m:Ljava/util/Iterator;

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:La/g45;

.field public p:I


# direct methods
.method public constructor <init>(La/g45;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/q8e;->o:La/g45;

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
    iput-object p1, p0, La/q8e;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/q8e;->p:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/q8e;->p:I

    .line 9
    .line 10
    iget-object p1, p0, La/q8e;->o:La/g45;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, p0}, La/g45;->O(La/pei0;La/gxb;La/zje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
