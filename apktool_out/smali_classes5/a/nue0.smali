.class public final La/nue0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/oue0;

.field public k:I


# direct methods
.method public constructor <init>(La/oue0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/nue0;->j:La/oue0;

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
    iput-object p1, p0, La/nue0;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/nue0;->k:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/nue0;->k:I

    .line 9
    .line 10
    const/4 p1, 0x0

    .line 11
    const-wide/16 v0, 0x0

    .line 12
    .line 13
    iget-object v2, p0, La/nue0;->j:La/oue0;

    .line 14
    .line 15
    invoke-virtual {v2, p1, v0, v1, p0}, La/oue0;->b(IJLa/zje;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method
