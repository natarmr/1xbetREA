.class public final La/nvz;
.super La/zje;
.source "SourceFile"


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/qvz;

.field public k:I


# direct methods
.method public constructor <init>(La/qvz;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/nvz;->j:La/qvz;

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
    iput-object p1, p0, La/nvz;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/nvz;->k:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/nvz;->k:I

    .line 9
    .line 10
    iget-object p1, p0, La/nvz;->j:La/qvz;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/qvz;->M(La/zje;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
