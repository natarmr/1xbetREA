.class public final La/in10;
.super La/zje;
.source "SourceFile"


# instance fields
.field public synthetic i:Ljava/lang/Object;

.field public final synthetic j:La/pn10;

.field public k:I


# direct methods
.method public constructor <init>(La/pn10;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/in10;->j:La/pn10;

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
    iput-object p1, p0, La/in10;->i:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/in10;->k:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/in10;->k:I

    .line 9
    .line 10
    iget-object p1, p0, La/in10;->j:La/pn10;

    .line 11
    .line 12
    invoke-virtual {p1, p0}, La/pn10;->S(La/zje;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    return-object p0
.end method
