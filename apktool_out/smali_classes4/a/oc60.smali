.class public final La/oc60;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Ljava/util/ArrayList;

.field public j:Ljava/util/HashMap;

.field public k:Ljava/util/Map;

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/pzu;

.field public n:I


# direct methods
.method public constructor <init>(La/pzu;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/oc60;->m:La/pzu;

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
    .locals 8

    .line 1
    iput-object p1, p0, La/oc60;->l:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/oc60;->n:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/oc60;->n:I

    .line 9
    .line 10
    const-wide/16 v3, 0x0

    .line 11
    .line 12
    const-wide/16 v5, 0x0

    .line 13
    .line 14
    iget-object v0, p0, La/oc60;->m:La/pzu;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x0

    .line 18
    move-object v7, p0

    .line 19
    invoke-virtual/range {v0 .. v7}, La/pzu;->s0(Ljava/util/ArrayList;Ljava/util/HashMap;JJLa/zje;)Ljava/io/Serializable;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
