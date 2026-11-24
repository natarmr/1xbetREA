.class public final La/ebg;
.super La/zje;
.source "SourceFile"


# instance fields
.field public i:Ljava/util/Calendar;

.field public j:Ljava/util/Iterator;

.field public k:La/c5g;

.field public l:I

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:La/hbg;

.field public o:I


# direct methods
.method public constructor <init>(La/hbg;La/zje;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/ebg;->n:La/hbg;

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
    iput-object p1, p0, La/ebg;->m:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, La/ebg;->o:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, La/ebg;->o:I

    .line 9
    .line 10
    iget-object p1, p0, La/ebg;->n:La/hbg;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    invoke-virtual {p1, v0, v0, p0}, La/hbg;->z(Ljava/util/List;Ljava/util/Calendar;La/zje;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
