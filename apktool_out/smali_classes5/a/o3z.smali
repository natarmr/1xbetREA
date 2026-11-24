.class public final La/o3z;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/u3z;

.field public j:La/h4z;

.field public k:J

.field public l:Z

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:La/tzi;

.field public o:I


# direct methods
.method public constructor <init>(La/tzi;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/o3z;->n:La/tzi;

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
    iput-object p1, p0, La/o3z;->m:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/o3z;->o:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/o3z;->o:I

    .line 9
    .line 10
    iget-object p1, p0, La/o3z;->n:La/tzi;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, p0}, La/tzi;->k(La/u3z;Ljava/lang/Long;La/zje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
