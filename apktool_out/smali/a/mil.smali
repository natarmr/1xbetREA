.class public final La/mil;
.super La/zn00;
.source "SourceFile"


# instance fields
.field public final synthetic c:La/zn00;


# direct methods
.method public constructor <init>(La/zn00;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/mil;->c:La/zn00;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1}, La/zn00;-><init>(B)V

    .line 5
    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public final K0(La/gb10;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, La/mil;->c:La/zn00;

    .line 2
    .line 3
    iget-object p0, p0, La/zn00;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/ayj0;

    .line 6
    .line 7
    check-cast p0, Ljava/lang/Float;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    return-object p0

    .line 13
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    const p1, 0x40233333    # 2.55f

    .line 18
    .line 19
    .line 20
    mul-float/2addr p0, p1

    .line 21
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0
.end method
