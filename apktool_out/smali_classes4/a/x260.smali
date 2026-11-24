.class public final La/x260;
.super La/zje;


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public j:I

.field public final synthetic k:La/nr30;


# direct methods
.method public constructor <init>(La/nr30;La/yje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/x260;->k:La/nr30;

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
    iput-object p1, p0, La/x260;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/x260;->j:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/x260;->j:I

    .line 9
    .line 10
    iget-object p1, p0, La/x260;->k:La/nr30;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, p0}, La/nr30;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
