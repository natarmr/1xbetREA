.class public abstract La/cp80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/jiy;


# static fields
.field public static final a:La/wgi0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    new-array v0, v0, [La/ugi0;

    .line 3
    .line 4
    const-string v1, "kotlin.Array<android.os.Parcelable>"

    .line 5
    .line 6
    invoke-static {v1, v0}, La/x2x;->F(Ljava/lang/String;[La/ugi0;)La/wgi0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, La/cp80;->a:La/wgi0;

    .line 11
    .line 12
    return-void
.end method

.method public static a(La/rkj;)[Landroid/os/Parcelable;
    .locals 5

    .line 1
    instance-of v0, p0, La/tzg0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_3

    .line 5
    .line 6
    check-cast p0, La/tzg0;

    .line 7
    .line 8
    iget-object v0, p0, La/tzg0;->l:Landroid/os/Bundle;

    .line 9
    .line 10
    iget-object p0, p0, La/tzg0;->n:Ljava/lang/String;

    .line 11
    .line 12
    const-class v2, Landroid/os/Parcelable;

    .line 13
    .line 14
    sget-object v3, La/sre0;->a:La/tre0;

    .line 15
    .line 16
    invoke-virtual {v3, v2}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, La/azw;->G(La/sgy;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 28
    .line 29
    const/16 v4, 0x22

    .line 30
    .line 31
    if-lt v3, v4, :cond_0

    .line 32
    .line 33
    invoke-static {v0, p0, v2}, La/f7;->f(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, [Landroid/os/Parcelable;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    invoke-virtual {v0, p0}, Landroid/os/Bundle;->getParcelableArray(Ljava/lang/String;)[Landroid/os/Parcelable;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_0
    if-eqz v0, :cond_1

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    move-object v0, v1

    .line 48
    :goto_1
    if-eqz v0, :cond_2

    .line 49
    .line 50
    return-object v0

    .line 51
    :cond_2
    invoke-static {p0}, La/g8x;->O(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    throw v1

    .line 55
    :cond_3
    sget-object v0, La/cp80;->a:La/wgi0;

    .line 56
    .line 57
    iget-object v0, v0, La/wgi0;->a:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v0, p0}, La/h8x;->E(Ljava/lang/String;La/rkj;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-object v1
.end method
