.class public abstract La/kkq;
.super La/tft0;
.source "SourceFile"

# interfaces
.implements La/nkq;


# instance fields
.field public final b:La/kzj0;

.field public final c:La/kzj0;


# direct methods
.method public constructor <init>(La/kzj0;La/kzj0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/kkq;->b:La/kzj0;

    .line 11
    .line 12
    iput-object p2, p0, La/kkq;->c:La/kzj0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final J()Ljava/util/List;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/kkq;->n0()La/kzj0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/wsy;->J()Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final K()La/ays0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/kkq;->n0()La/kzj0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/wsy;->K()La/ays0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final S()La/iys0;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/kkq;->n0()La/kzj0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/wsy;->S()La/iys0;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final U()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, La/kkq;->n0()La/kzj0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/wsy;->U()Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public n0()La/kzj0;
    .locals 0

    .line 1
    iget-object p0, p0, La/kkq;->b:La/kzj0;

    .line 2
    .line 3
    return-object p0
.end method

.method public o0(La/iek;La/iek;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p2, p2, La/iek;->a:La/lek;

    .line 2
    .line 3
    invoke-virtual {p2}, La/lek;->p()Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    iget-object v0, p0, La/kkq;->c:La/kzj0;

    .line 8
    .line 9
    iget-object v1, p0, La/kkq;->b:La/kzj0;

    .line 10
    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    new-instance p0, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string p2, "("

    .line 16
    .line 17
    invoke-direct {p0, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v1}, La/iek;->P(La/wsy;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string p2, ".."

    .line 28
    .line 29
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, La/iek;->P(La/wsy;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const/16 p1, 0x29

    .line 40
    .line 41
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :cond_0
    invoke-virtual {p1, v1}, La/iek;->P(La/wsy;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    invoke-virtual {p1, v0}, La/iek;->P(La/wsy;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {p0}, La/vsm0;->q(La/wsy;)La/ary;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p1, p2, v0, p0}, La/iek;->w(Ljava/lang/String;Ljava/lang/String;La/ary;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, La/iek;->e:La/iek;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, La/iek;->P(La/wsy;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public y()La/cr30;
    .locals 0

    .line 1
    invoke-virtual {p0}, La/kkq;->n0()La/kzj0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, La/wsy;->y()La/cr30;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
