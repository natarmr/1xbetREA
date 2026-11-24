.class public final La/czg;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:La/epe;

.field public n:La/dzg;

.field public o:La/czg;

.field public p:Ljava/lang/Throwable;

.field public q:J

.field public r:J

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:La/dzg;

.field public u:I


# direct methods
.method public constructor <init>(La/dzg;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/czg;->t:La/dzg;

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
    .locals 2

    .line 1
    iput-object p1, p0, La/czg;->s:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/czg;->u:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/czg;->u:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const/4 v0, 0x0

    .line 12
    iget-object v1, p0, La/czg;->t:La/dzg;

    .line 13
    .line 14
    invoke-virtual {v1, p1, v0, p0}, La/dzg;->d(ILa/epe;La/zje;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
