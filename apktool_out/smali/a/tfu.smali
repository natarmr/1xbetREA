.class public final La/tfu;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:J

.field public j:La/sip;

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:La/rrd;

.field public m:I


# direct methods
.method public constructor <init>(La/rrd;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/tfu;->l:La/rrd;

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
    iput-object p1, p0, La/tfu;->k:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/tfu;->m:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/tfu;->m:I

    .line 9
    .line 10
    const-wide/16 v0, 0x0

    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    iget-object v2, p0, La/tfu;->l:La/rrd;

    .line 14
    .line 15
    invoke-virtual {v2, v0, v1, p1, p0}, La/rrd;->o(JLa/sip;La/zje;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
