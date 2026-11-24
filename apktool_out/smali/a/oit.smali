.class public final La/oit;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/cht;

.field public j:Ljava/lang/String;

.field public k:D

.field public synthetic l:Ljava/lang/Object;

.field public final synthetic m:La/sit;

.field public n:I


# direct methods
.method public constructor <init>(La/sit;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/oit;->m:La/sit;

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
    iput-object p1, p0, La/oit;->l:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/oit;->n:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/oit;->n:I

    .line 9
    .line 10
    iget-object p1, p0, La/oit;->m:La/sit;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/sit;->N(La/zje;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
