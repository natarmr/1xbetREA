.class public final La/fm4;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/uu4;

.field public j:Ljava/lang/String;

.field public k:Lkotlin/jvm/functions/Function2;

.field public l:Ljava/lang/String;

.field public m:La/m2c0;

.field public synthetic n:Ljava/lang/Object;

.field public final synthetic o:La/im4;

.field public p:I


# direct methods
.method public constructor <init>(La/im4;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/fm4;->o:La/im4;

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
    .locals 6

    .line 1
    iput-object p1, p0, La/fm4;->n:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/fm4;->p:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/fm4;->p:I

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    const/4 v4, 0x0

    .line 12
    iget-object v0, p0, La/fm4;->o:La/im4;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    move-object v5, p0

    .line 17
    invoke-virtual/range {v0 .. v5}, La/im4;->i(La/uu4;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0
.end method
