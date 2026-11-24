.class public final Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/QrCheckCodeBySmsScreen;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/github/terrakok/cicerone/androidx/FragmentScreen;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u0000\u0018\u00002\u00020\u0001\u00a8\u0006\u0002"
    }
    d2 = {
        "Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/QrCheckCodeBySmsScreen;",
        "Lcom/github/terrakok/cicerone/androidx/FragmentScreen;",
        "impl"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final a:La/swp0;

.field public final b:J

.field public final c:La/yed0;

.field public final d:Ljava/util/List;


# direct methods
.method public constructor <init>(La/swp0;JLa/yed0;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/QrCheckCodeBySmsScreen;->a:La/swp0;

    .line 8
    .line 9
    iput-wide p2, p0, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/QrCheckCodeBySmsScreen;->b:J

    .line 10
    .line 11
    iput-object p4, p0, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/QrCheckCodeBySmsScreen;->c:La/yed0;

    .line 12
    .line 13
    iput-object p5, p0, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/QrCheckCodeBySmsScreen;->d:Ljava/util/List;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(La/m1r;)Landroidx/fragment/app/Fragment;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p1, La/jgd0;->V1:La/xi70;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/QrCheckCodeBySmsScreen;->d:Ljava/util/List;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance v0, La/jgd0;

    .line 15
    .line 16
    invoke-direct {v0}, La/jgd0;-><init>()V

    .line 17
    .line 18
    .line 19
    sget-object v1, La/jgd0;->W1:[La/iiy;

    .line 20
    .line 21
    const/4 v2, 0x1

    .line 22
    aget-object v2, v1, v2

    .line 23
    .line 24
    iget-object v3, v0, La/jgd0;->Q1:La/yzn0;

    .line 25
    .line 26
    iget-object v4, p0, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/QrCheckCodeBySmsScreen;->a:La/swp0;

    .line 27
    .line 28
    invoke-virtual {v3, v0, v2, v4}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x2

    .line 32
    aget-object v2, v1, v2

    .line 33
    .line 34
    iget-object v3, v0, La/jgd0;->R1:La/r34;

    .line 35
    .line 36
    iget-wide v4, p0, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/QrCheckCodeBySmsScreen;->b:J

    .line 37
    .line 38
    invoke-virtual {v3, v0, v2, v4, v5}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 39
    .line 40
    .line 41
    const/4 v2, 0x3

    .line 42
    aget-object v2, v1, v2

    .line 43
    .line 44
    iget-object v3, v0, La/jgd0;->S1:La/yzn0;

    .line 45
    .line 46
    iget-object p0, p0, Lorg/xplatform/authqr/impl/qr/presentation/confirmation/sms/check/QrCheckCodeBySmsScreen;->c:La/yed0;

    .line 47
    .line 48
    invoke-virtual {v3, v0, v2, p0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 49
    .line 50
    .line 51
    const/4 p0, 0x4

    .line 52
    aget-object p0, v1, p0

    .line 53
    .line 54
    iget-object v1, v0, La/jgd0;->U1:La/es;

    .line 55
    .line 56
    invoke-virtual {v1, v0, p0, p1}, La/es;->D(Landroidx/fragment/app/Fragment;La/iiy;Ljava/util/List;)V

    .line 57
    .line 58
    .line 59
    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "QrCheckCodeBySmsFragment"

    .line 2
    .line 3
    return-object p0
.end method

.method public final bridge g()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method
