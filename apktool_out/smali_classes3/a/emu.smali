.class public final La/emu;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Ljava/util/List;

.field public j:Ljava/util/List;

.field public k:Ljava/util/List;

.field public l:Ljava/util/List;

.field public m:Ljava/util/List;

.field public n:Ljava/util/List;

.field public o:Ljava/util/List;

.field public synthetic p:Ljava/lang/Object;

.field public final synthetic q:La/lhf0;

.field public r:I


# direct methods
.method public constructor <init>(La/lhf0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/emu;->q:La/lhf0;

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
    iput-object p1, p0, La/emu;->p:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/emu;->r:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/emu;->r:I

    .line 9
    .line 10
    iget-object p1, p0, La/emu;->q:La/lhf0;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/lhf0;->x(La/zje;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
