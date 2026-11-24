.class public final La/dmt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/pru;


# direct methods
.method public synthetic constructor <init>(La/pru;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/dmt;->a:La/pru;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(La/pru;La/eke0;La/gne0;La/eke0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, La/dmt;->a:La/pru;

    return-void
.end method


# virtual methods
.method public a(Lorg/xplatform/registration_default/api/presentation/model/RegistrationDefaultScreenParams;)Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;
    .locals 3

    .line 1
    iget-object p0, p0, La/dmt;->a:La/pru;

    .line 2
    .line 3
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, La/sff0;->N:La/co4;

    .line 8
    .line 9
    iget-object p0, p0, La/co4;->q:La/kse0;

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_2

    .line 16
    .line 17
    const/4 p1, 0x1

    .line 18
    if-eq p0, p1, :cond_1

    .line 19
    .line 20
    const/4 p1, 0x2

    .line 21
    if-ne p0, p1, :cond_0

    .line 22
    .line 23
    new-instance p0, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;

    .line 24
    .line 25
    sget-object p1, La/z3f0;->Y1:La/zie0;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    sget-object p1, La/z3f0;->a2:Ljava/lang/String;

    .line 31
    .line 32
    new-instance v0, La/e9d0;

    .line 33
    .line 34
    const/16 v1, 0x9

    .line 35
    .line 36
    invoke-direct {v0, v1}, La/e9d0;-><init>(B)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, p1, v0}, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;-><init>(Ljava/lang/String;La/xbf;)V

    .line 40
    .line 41
    .line 42
    return-object p0

    .line 43
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    return-object p0

    .line 48
    :cond_1
    new-instance p0, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;

    .line 49
    .line 50
    sget-object p1, La/iaf0;->Z1:La/zie0;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    sget-object p1, La/iaf0;->b2:Ljava/lang/String;

    .line 56
    .line 57
    new-instance v0, La/e9d0;

    .line 58
    .line 59
    const/16 v1, 0xa

    .line 60
    .line 61
    invoke-direct {v0, v1}, La/e9d0;-><init>(B)V

    .line 62
    .line 63
    .line 64
    invoke-direct {p0, p1, v0}, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;-><init>(Ljava/lang/String;La/xbf;)V

    .line 65
    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_2
    new-instance p0, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;

    .line 69
    .line 70
    sget-object v0, La/dxe0;->Y1:La/lme0;

    .line 71
    .line 72
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 73
    .line 74
    .line 75
    sget-object v0, La/dxe0;->a2:Ljava/lang/String;

    .line 76
    .line 77
    new-instance v1, La/ex60;

    .line 78
    .line 79
    const/16 v2, 0x12

    .line 80
    .line 81
    invoke-direct {v1, p1, v2}, La/ex60;-><init>(Ljava/lang/Object;B)V

    .line 82
    .line 83
    .line 84
    invoke-direct {p0, v0, v1}, Lorg/xplatform/core/navigation/authorization/screen/Authorization$Registration$Screen;-><init>(Ljava/lang/String;La/xbf;)V

    .line 85
    .line 86
    .line 87
    return-object p0
.end method

.method public b()La/kg;
    .locals 0

    .line 1
    iget-object p0, p0, La/dmt;->a:La/pru;

    .line 2
    .line 3
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    iget-object p0, p0, La/sff0;->g:La/mum0;

    .line 8
    .line 9
    iget-object p0, p0, La/mum0;->e:La/kg;

    .line 10
    .line 11
    return-object p0
.end method
