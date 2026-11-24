.class public final La/uof0;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:La/rer;

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/vof0;

.field public l:I


# direct methods
.method public constructor <init>(La/vof0;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/uof0;->k:La/vof0;

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
    iput-object p1, p0, La/uof0;->j:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/uof0;->l:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/uof0;->l:I

    .line 9
    .line 10
    sget-object p1, La/vof0;->O1:[La/iiy;

    .line 11
    .line 12
    iget-object v0, p0, La/uof0;->k:La/vof0;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    const/4 v4, 0x0

    .line 18
    move-object v5, p0

    .line 19
    invoke-virtual/range {v0 .. v5}, La/vof0;->L0(Ljava/util/ArrayList;ZLa/mrf0;Lkotlin/jvm/functions/Function0;La/zje;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    return-object p0
.end method
