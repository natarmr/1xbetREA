.class public final La/hos;
.super La/zje;
.source "SourceFile"


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/nmo;

.field public k:I


# direct methods
.method public constructor <init>(La/nmo;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/hos;->j:La/nmo;

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
    iput-object p1, p0, La/hos;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/hos;->k:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/hos;->k:I

    .line 9
    .line 10
    iget-object p1, p0, La/hos;->j:La/nmo;

    .line 11
    .line 12
    const-wide/16 v0, 0x0

    .line 13
    .line 14
    invoke-virtual {p1, v0, v1, p0}, La/nmo;->a(JLa/zje;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method
