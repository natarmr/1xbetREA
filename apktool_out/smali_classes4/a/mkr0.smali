.class public final La/mkr0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/w5z;

.field public k:I


# direct methods
.method public constructor <init>(La/w5z;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/mkr0;->j:La/w5z;

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
    .locals 7

    .line 1
    iput-object p1, p0, La/mkr0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/mkr0;->k:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/mkr0;->k:I

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    const-wide/16 v4, 0x0

    .line 13
    .line 14
    iget-object v0, p0, La/mkr0;->j:La/w5z;

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    move-object v6, p0

    .line 18
    invoke-virtual/range {v0 .. v6}, La/w5z;->b0(Ljava/lang/String;DJLa/zje;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
