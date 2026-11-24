.class public abstract La/cvb;
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
    const-string v1, "kotlin.Array<kotlin.CharSequence>"

    .line 5
    .line 6
    invoke-static {v1, v0}, La/x2x;->F(Ljava/lang/String;[La/ugi0;)La/wgi0;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    sput-object v0, La/cvb;->a:La/wgi0;

    .line 11
    .line 12
    return-void
.end method

.method public static a(La/rkj;)[Ljava/lang/CharSequence;
    .locals 2

    .line 1
    instance-of v0, p0, La/tzg0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

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
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p0}, Landroid/os/Bundle;->getCharSequenceArray(Ljava/lang/String;)[Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    return-object v0

    .line 22
    :cond_0
    invoke-static {p0}, La/g8x;->O(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw v1

    .line 26
    :cond_1
    sget-object v0, La/cvb;->a:La/wgi0;

    .line 27
    .line 28
    iget-object v0, v0, La/wgi0;->a:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, p0}, La/h8x;->E(Ljava/lang/String;La/rkj;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    invoke-static {p0}, La/c99;->s(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    return-object v1
.end method
