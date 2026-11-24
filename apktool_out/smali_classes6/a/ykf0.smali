.class public final La/ykf0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/m0k0;

.field public j:La/zxj0;

.field public k:La/qu6;

.field public l:Ljava/lang/String;

.field public m:Ljava/lang/String;

.field public n:Ljava/lang/String;

.field public o:Ljava/lang/String;

.field public p:Z

.field public q:J

.field public r:J

.field public synthetic s:Ljava/lang/Object;

.field public final synthetic t:La/xzp;

.field public u:I


# direct methods
.method public constructor <init>(La/xzp;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ykf0;->t:La/xzp;

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
    iput-object p1, p0, La/ykf0;->s:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/ykf0;->u:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/ykf0;->u:I

    .line 9
    .line 10
    iget-object p1, p0, La/ykf0;->t:La/xzp;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, v0, p0}, La/xzp;->N(La/m0k0;La/zxj0;La/gwe;La/zje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
