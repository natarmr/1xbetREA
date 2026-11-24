.class public final La/lfk0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/qah0;

.field public j:La/ucz;

.field public k:I

.field public l:F

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:La/pfk0;

.field public o:I


# direct methods
.method public constructor <init>(La/pfk0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/lfk0;->n:La/pfk0;

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
    .locals 3

    .line 1
    iput-object p1, p0, La/lfk0;->m:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/lfk0;->o:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/lfk0;->o:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, La/lfk0;->n:La/pfk0;

    .line 13
    .line 14
    const/4 v2, 0x0

    .line 15
    invoke-virtual {v1, v2, p1, v0, p0}, La/pfk0;->c(La/qah0;IFLa/zje;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
